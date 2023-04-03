public class App {
    public static void main(String[] args) throws Exception {
        EstadoCivil casado = EstadoCivil.CASADO;
        System.out.println(casado.getValue());

    }
    public enum EstadoCivil {
        SOLTEIRO("solteiro"),
        CASADO("casado"),
        SEPARADO("separado"),
        DIVORCIADO("divorciado"),
        VIUVO("viúvo");

        private String value;

        public String getValue() {
            return value;
        }

        private EstadoCivil(String value){
            this.value = value;
        }
    }
    
}