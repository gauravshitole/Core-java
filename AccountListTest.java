package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AccountListTest {
    public static void main(String[] args){
        Account viratAccount=new Account("1111",123,"Saving",10120.00);
        Account sachintAccount=new Account("1131",122,"Saving",130.00);
        Account abhiAccount=new Account("1151",124,"Saving",1065.00);
        List<Account> accountList=new ArrayList<>();
        accountList.add(viratAccount);
        accountList.add(sachintAccount);
        accountList.add(abhiAccount);
        System.out.println("virat Account"+viratAccount);
        System.out.println("abhi Account"+accountList);
        Collections.sort(accountList);
        System.out.println("new List"+accountList);
    }
}
