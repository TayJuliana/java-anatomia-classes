public class MinhaClasse {

    public static void main (String [] args) {

        String primeiroNome = "Taynara";
        String segundoNome = "Juliana";
        String ultimoNome = "Cruz";

        String nomeCompleto = nomeCompleto (primeiroNome,segundoNome,ultimoNome);

        System.out.println(nomeCompleto);

        }
        public static String nomeCompleto (String primeiroNome, String segundoNome, String ultimoNome){
            return primeiroNome.concat(" ").concat(segundoNome);
        }
        

}
