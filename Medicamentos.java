public abstract class Medicamentos {

        private String nome;
        private String principioAtivo;
        private String modoUsar;
        private double mg;
    
        public Medicamentos(){}
    
        public Medicamentos(String nome, String principioAtivo, String modoUsar, double mg) {
            this.nome = nome;
            this.principioAtivo = principioAtivo;
            this.modoUsar = modoUsar;
            this.mg = mg;
        }
    
        public String getNome() {
            return nome;
        }
    
        public void setNome(String nome) {
            this.nome = nome;
        }
    
        public String getPrincipioAtivo() {
            return principioAtivo;
        }
    
        public void setPrincipioAtivo(String principioAtivo) {
            this.principioAtivo = principioAtivo;
        }
    
        public String getModoUsar() {
            return modoUsar;
        }
    
        public void setModoUsar(String modoUsar) {
            this.modoUsar = modoUsar;
        }
    
        public double getMg() {
            return mg;
        }
    
        public void setMg(double mg) {
            this.mg = mg;
        }

        public abstract String admistracao();
    
        @Override
        public String toString() {
            return "Nome: " + nome + " PrincipioAtivo: " + principioAtivo + " Modo de Usar: " + modoUsar + " MG: " + mg;
        }
        
}
