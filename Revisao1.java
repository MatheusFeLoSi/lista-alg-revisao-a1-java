import java.util.Scanner;

public class Revisao1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); 

        //Identificação do usuário 

        String nome;
        int idade;

        System.out.println("Informe o seu nome: ");
            nome = scanner.nextLine();
            System.out.println("Bem vindo, " + nome + "!\nAgora me informe sua idade: ");
                idade = scanner.nextInt();
                System.out.println("--------------------------------------");   
                System.out.println("Dados confirmados.\nNome: " + nome + "\nIdade: " + idade + " anos");
                System.out.println("--------------------------------------");
    


        System.out.println("As perguntas a seguir deverão ser respondidas apenas com 'sim' ou 'não'.");
        System.out.println("--------------------------------------");

        //Pergunta sobre a vacina

        String vacina;
        int porcentagemVacina = 0; 

        System.out.println("Seu cartão de vacina está em dia? ");   
            vacina = scanner.next().toUpperCase();
            System.out.println("--------------------------------------");

            if (vacina.equals("SIM")) {
                System.out.println("DADO COLETADO COM SUCESSO.");
                System.out.println("--------------------------------------");
            }

            else if (vacina.equals("NAO")) {
                System.out.println("DADO COLETADO COM SUCESSO.");
                System.out.println("--------------------------------------"); 
            }

            else {  
                int contador = 0;
                while (!vacina.equals("SIM") && (!vacina.equals("NAO"))) {
                    System.out.println("Por favor, insira uma resposta válida.");
                        vacina = scanner.next().toUpperCase();
                            contador++;
                            if (contador >=2) {
                                System.out.println("Não foi possível realizar o diagnóstico. Gentileza procurar ajuda médica caso apareça algum sintoma.");
                                System.out.println("--------------------------------------"); 
                            }               
                    }
                }

            if (vacina.equals("NAO")) {
                porcentagemVacina = 10;
            }

        //Pergunta sobre os sintomas 

        String sintoma;
        int porcentagemSintoma = 0; 

        System.out.println("Você teve algum dos seguintes sintomas recentemente?\n(Dor de cabeça, febre, náusea, dor articular e gripe)");
                sintoma = scanner.next().toUpperCase();
                System.out.println("--------------------------------------");


                if (sintoma.equals("SIM")) {
                    System.out.println("DADO COLETADO COM SUCESSO.");
                    System.out.println("--------------------------------------");
                }

                else if (sintoma.equals("NAO")) {
                    System.out.println("DADO COLETADO COM SUCESSO.");
                    System.out.println("--------------------------------------");
                }

                else { 
                    int contador = 0;
                    while (!sintoma.equals("SIM") && (!sintoma.equals("NAO"))) {
                        System.out.println("Por favor, insira uma resposta válida.");
                            sintoma = scanner.next().toUpperCase();
                                contador++;
                                if (contador >=2) {
                                    System.out.println("Não foi possível realizar o diagnóstico. Gentileza procurar ajuda médica caso apareça algum sintoma.");
                                    System.out.println("--------------------------------------");
                                }               
                        }
                    }

                if (sintoma.equals("SIM")) {
                    porcentagemSintoma = 30;
                }


                //Pergunta sobre o contato 
                
                String contato;
                int porcentagemContato = 0;

                System.out.println("Você teve contato com sintomas gripais nos últimos dias? ");
                    contato = scanner.next().toUpperCase();
                    System.out.println("--------------------------------------"); 

                if (contato.equals("SIM")) {
                    System.out.println("DADO COLETADO COM SUCESSO.");
                    System.out.println("--------------------------------------");
                }

                else if (contato.equals("NAO")) {
                    System.out.println("DADO COLETADO COM SUCESSO.");
                    System.out.println("--------------------------------------");
                }

                else { 
                    int contador = 0;
                    while (!contato.equals("SIM") && (!contato.equals("NAO"))) {
                        System.out.println("Por favor, insira uma resposta válida.");
                            contato = scanner.next().toUpperCase();
                                contador++;
                                if (contador >=2) {
                                    System.out.println("Não foi possível realizar o diagnóstico. Gentileza procurar ajuda médica caso apareça algum sintoma.");
                                    System.out.println("--------------------------------------");
                                }               
                        }
                    }

                if (contato.equals("SIM")) {
                    porcentagemContato = 30; 
                }


                //Pergunta sobre a viagem 

                String viagem;
                int porcentagemViagem = 0;

                System.out.println("Está retornando de viagem realizada no exterior? ");
                    viagem = scanner.next().toUpperCase(); 
                    System.out.println("--------------------------------------");

                
                if (viagem.equals("SIM")) {
                    System.out.println("DADO COLETADO COM SUCESSO.");
                }
                
                else if (viagem.equals("NAO")) {
                    System.out.println("DADO COLETADO COM SUCESSO.");
                }

                else { 
                    int contador = 0;
                    while (!viagem.equals("SIM") && (!viagem.equals("NAO"))) {
                        System.out.println("Por favor, insira uma resposta válida.");
                            viagem = scanner.next().toUpperCase();
                                contador++;
                                if (contador >=2) {
                                    System.out.println("Não foi possível realizar o diagnóstico. Gentileza procurar ajuda médica caso apareça algum sintoma.");
                                    System.out.println("--------------------------------------");
                                }               
                        }
                    }

                    if (viagem.equals("SIM")) {
                        System.out.println("De imediato, você ficará sob observação por 05 dias");
                            porcentagemViagem = 30; 
                    }

        
                    //Resultados finais

                    System.out.println("--------------------------------------");
                    System.out.println("Nome: " + nome);
                    System.out.println("Idade: " + idade);
                    System.out.println("Seu cartão de vacina está em dia? " + vacina);
                    System.out.println("Você teve algum dos seguintes sintomas recentemente? " + sintoma);
                    System.out.println("Você teve contato com sintomas gripais nos últimos dias? " + contato);
                    System.out.println("Está retornando de viagem realizada no exterior? " + viagem);
                    System.out.println(" ");
                    
                    //Comentário relátorio 
                    
                    int totalDaPorcentagem;

                    totalDaPorcentagem = (porcentagemVacina + porcentagemSintoma + porcentagemContato + porcentagemViagem);

                    
                    if (totalDaPorcentagem <= 30) {
                            System.out.println("Paciente sob observação. Caso apareça algum sintoma, gentileza buscar assistência médica.");
                    }

                    else if (totalDaPorcentagem <= 60) {
                        System.out.println("Paciente com risco de estar infectado. Gentileza aguardar em lockdown por 02 dias para ser acompanhado.");
                    }

                    else if (totalDaPorcentagem <= 80) {
                        System.out.println("Paciente com alto risco de estar infectado. Gentileza aguardar em lockdown por 05 dias para ser acompanhado.");
                    }

                    else if (totalDaPorcentagem > 80) {
                        System.out.println("Paciente crítico! Gentileza aguardar em lockdown por 10 dias para ser acompanhado");
                    }

                    System.out.println("--------------------------------------");
        
                    scanner.close();
    }
}
