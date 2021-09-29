import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

import static java.lang.System.exit;

public class urldatabase {
    public static void main(String[] args)throws Exception{
        int n=1;
        //urldb1 :Hashmap for storing url and uniquekey
        //urldb2 : Hashmap for storing url and count
        HashMap<String,String> urldb1=new HashMap<String,String>();
        HashMap<String,Integer> urldb2=new HashMap<String,Integer>();
        do{
            Scanner sc= new Scanner(System.in);
            String str[]= sc.nextLine().split(" ");
            switch(str[0])
            {
                case "storeurl":    String ss[] = str[1].split("\\.");
                    urldb1.put(str[1],ss[1]);
                    urldb2.put(str[1],0);
                    break;
                case "get":         System.out.println(urldb1.get(str[1]));
                    int c = urldb2.get(str[1])+1;
                    urldb2.put(str[1],c);
                    break;
                case "count":       System.out.println(urldb2.get(str[1]));
                    break;
                case "list":
                    Iterator  it= urldb1.entrySet().iterator();
                    System.out.println(" {\n\"url_data\":\n [\n");
                    int cc=0;
                    while(it.hasNext())
                    {
                        if(cc>0)
                        {
                            System.out.println(",\n");
                        }
                        Map.Entry me=(Map.Entry)it.next();
                        String ur=""+me.getKey();
                        String ke=""+me.getValue();
                        String cnt=""+urldb2.get(ur);
                        System.out.println("{");
                        System.out.println("\"URL\":"+"\""+ur+",\"\n" );
                        System.out.println("\"Key\":"+"\""+ke+",\"\n" );
                        System.out.println("\"Count\":"+"\""+cnt+",\"\n" );
                        System.out.println("}");
                        cc++;

                    }
                    System.out.println("]\n}");
                    break;
                case "exit":        exit(0);
                default:    System.out.println("Invalid Command");
                    break;
            }

        }while(n!=2);
    }
}