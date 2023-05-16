import exceptions.WrongAccountException;
import exceptions.WrongCurrencyException;
import exceptions.WrongOperationException;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        BankApplication bankApplication = new BankApplication();
            Arrays.stream(TestAccount.values()).forEach(account -> {
                try {
                    bankApplication.process(account.getId(), account.getAmount(), account.getCurrency());
                } catch (WrongAccountException e) {
                    System.out.printf("Такого акаунту %s не існує.", account.getId());
                } catch (WrongOperationException e) {
                    System.out.printf("Акаунт %s не має достатньо коштів.", account.getId());
                } catch (WrongCurrencyException e) {
                    System.out.printf("Акаунт %s має рахунок в іншій валюті.", account.getId());
                } catch (Exception e) {
                    System.out.println("Сталася помилка при процесінгу, спробуйте ще раз.");
                }
                finally {
                    System.out.print(" Дякуємо, що скористалися нашим сервісом.\n");
                }
            });
    }
}


