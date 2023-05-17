import java.util.Scanner;

public class App {
       public int[] numeros ={10,20,30};
    
    public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);
       int pontos =0;
       System.out.println("bem-vindo! digite s para darmos inicio ao jogo.");
       String string = scanner.nextLine(); 
       if(string.equals("s")){
        System.out.println("Qual a capital da paraíba?");
        string = scanner.nextLine();        
        if(string.equals("joao pessoa")){
            pontos++;
            System.out.println("Parabens! voce acertou."+pontos);
            System.out.println("deseja continuar? digite (s) ou (d) para desistir.");
            string = scanner.nextLine(); 
            /*segunda pergunta */
            if(string.equals("s")){
                pontos++;
                System.out.println("Quem descobriu o brasil?");
                string = scanner.nextLine();
               
                if(string.equals("pedro alvares cabral")){
                    pontos++;
                    System.out.println("muito bem! seus pontos ate aqui:"+pontos);
                    System.out.println("deseja continuar? digite (s) ou (d) para desistir.");
                    string = scanner.nextLine();
                    /*terseira pergunta */
                    if(string.equals("s")){
                        System.out.println("Quanto e 35 + 45?");
                        string = scanner.nextLine();
                        if(string.equals("80")){
                            pontos++;
                            System.out.println("muito bom , seus pontos ate agora sao:"+pontos);
                            System.out.println("deseja continuar? digite (s) ou (d) para desistir.");
                            string = scanner.nextLine();
                            if(string.equals("s")){
                                System.out.println("como podemos chamar o dia que passou?");
                                string = scanner.nextLine();
                                if(string.equals("ontem")){
                                    pontos++;
                                    System.out.println("Voce acertou! vamos para a proxima pergunta pontos:"+pontos);
                                    System.out.println("deseja continuar? digite (s) ou (d) para desistir.");
                                    string = scanner.nextLine();
                                    if(string.equals("s")){
                                        System.out.println("Como voce chama a mae da sua avo?");
                                        string = scanner.nextLine();
                                        if(string.equals("bisavo")){
                                            pontos++;
                                            System.out.println("Parabens voce zerou o jogo! seus pontos totais fui de:"+pontos);
                                        }else{
                                            System.out.println("Gamer over fim de jogo! seus pontos totais foi:"+pontos);
                                        }
                                    }
                                }else{
                                    System.out.println("Gamer over fim de jogo pontos:"+pontos);
                                }
                            }                           
                        }else{
                            System.out.println("Gamer over! seus pontos foram: "+pontos);
                        }
                    }                 
                }else{
                    System.out.println("Game over! seus pontos foram:"+pontos);
                }              

            }            
        }else{
            System.out.println("Game over! seus pontos foram:"+pontos);
        }
       }else{
        System.out.println("ops! voce digitou algo errado... voce nao pontuou.");
       }
}
}
  
 