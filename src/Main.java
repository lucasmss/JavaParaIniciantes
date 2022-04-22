import array.Empregado;
import auditoria.Inconformidade;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Locale.setDefault(Locale.US);
//        Scanner sc = new Scanner(System.in);
//        Banco banco;
//
//        System.out.println("Bem vindo ao Banco");
//        System.out.println("Digite o numero da conta !");
//        int conta = sc.nextInt();
//        System.out.println("Digite o nome do dona da conta !");
//        sc.nextLine();
//        String nome = sc.nextLine();
//        System.out.println("Voce quer fazer um deposito inicial ?? (s/n)");
//        char inic = sc.next().charAt(0);
//        if(inic == 's' || inic =='S') {
//
//            System.out.println("Digite o valor do deposito inicial !");
//            double depositoInicial = sc.nextDouble();
//
//            banco = new Banco(conta, nome, depositoInicial);
//
//        }else {
//
//            banco = new Banco(conta, nome);
//        }
//
//        System.out.println();
//        System.out.println("Dados da conta:");
//        System.out.println(banco);
//
//        System.out.println();
//        System.out.println("Digite um valor para deposito !");
//        double valorD = sc.nextDouble();
//        banco.Deposito(valorD);
//        System.out.println("Atualização dos dados da conta !");
//        System.out.println(banco);
//
//        System.out.println();
//        System.out.println("Digite um valor para sacar !");
//        double valorS = sc.nextDouble();
//        banco.Sacar(valorS);
//        System.out.println("Atualização dos dados da conta !");
//        System.out.println(banco);
//
//
//        sc.close();
//

//        Locale.setDefault(Locale.US);
//        Scanner sc = new Scanner(System.in);
//
//        List<Empregado> list = new ArrayList<>();
//
//        System.out.println("Qunatos empregados vai adicionar ??");
//        int n = sc.nextInt();
//
//        for(int i = 0; i < n; i++) {
//            System.out.println("Digite o id do funcionario:");
//            int id = sc.nextInt();
//
//            System.out.println("Digite o nome do funcionario:");
//            sc.nextLine();
//            String nome = sc.nextLine();
//
//            System.out.println("Digite o salario do funcionario:");
//            double salario = sc.nextDouble();
//
//            list.add(new Empregado(id, nome, salario));
//        }
//
//        System.out.println();
//        System.out.print("Digite o id do funcionario para aumento: ");
//
//        int id = sc.nextInt();
//
//        Empregado emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
//
//        if (emp == null) {
//            System.out.println("Essa id não existe!");
//        }
//
//        else {
//            System.out.print("Coloque a porcentagem: ");
//            double percent = sc.nextDouble();
//            emp.porcentoSalario(percent);
//        }
//
//        System.out.println();
//        System.out.println("Lista de empregados:");
//
//        for (Empregado obj : list) {
//            System.out.println(obj);
//            System.out.println("Teste OBJ" + obj.getSalario());
//        }
//        sc.close();

        Inconformidade inconformidade;

        ArrayList<Inconformidade> dadosInconformidade = new ArrayList<Inconformidade>();

        dadosInconformidade.add(new Inconformidade("lucas", "sem SLA"));
        dadosInconformidade.add(new Inconformidade("daniel", "sem senha"));

        System.out.println("passei aqui " + dadosInconformidade);

        for (Inconformidade dadosInconformidades: dadosInconformidade) {

            dadosInconformidades.getUsuario();

            System.out.println("dados nome: " + dadosInconformidades.getUsuario());
        }



    }
}