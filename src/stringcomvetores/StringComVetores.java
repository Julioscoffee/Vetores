package stringcomvetores;

public class StringComVetores {

    public static void main(String[] args) {
        int ano = 2018;
        int v[] = {1, 2, 3};
        double[] numeros = new double[10];
        
        //imprimindo
        System.out.println(v[1]);
        numeros[5] = 500;
        System.out.println(numeros[5]);
        
        //String
        String palavra = "Curso de Java";
        System.out.println(palavra.charAt(0));
        System.out.println(palavra.charAt(4));
        System.out.println(palavra.replace('a', 'e')); //Não está atribuindo à variável, apenas mostra
        palavra = palavra.replace('a', 'e'); //Atribui o replace à variável
        System.out.println(palavra); //Após atribuir, mostra com o replace aplicado
        
        String palavra2 = palavra.replace(' ', '/'); //Atribuindo o replace de "palavra" à outra variavel
        System.out.println(palavra2); //Mostrando o resultado do replace atribuído à "palavra2"
        System.out.println(palavra2.substring(0, 5)); //Pega os caracteres de 0 à 4
        System.out.println(palavra2.substring(9)); //Pega os caracteres de 9 em diante
        System.out.println(palavra2.toUpperCase()); //Substitui pra maiúsculas
        System.out.println(palavra2.toLowerCase()); //Substitui pra minúsculas
        System.out.println(palavra + palavra2); //Mostra as 2 variáveis
        
        //Imprimindo vetores
        for(int i=0; i<v.length; i++){
            System.out.println(v[i]); //Imprime o caractere que tem a posição no valor de "i"
        }
        
        for (int j=0; j<palavra.length(); j++){
            System.out.println(palavra.charAt(j)); //Mesma coisa porém usa o "charAt" para variável do tipo String
        }
    }
    
}
