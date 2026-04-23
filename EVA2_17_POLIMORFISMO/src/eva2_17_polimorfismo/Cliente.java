/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
    package eva2_17_polimorfismo;

    /**
     *
     * @author aldop
     */
    public class Cliente extends Persona {
        private String rfc;
        private double Credito;

            public Cliente(String rfc, double Credito) {
                this.rfc = rfc;
                this.Credito = Credito;
            }

        public String getRfc() {
            return rfc;
        }

        public void setRfc(String rfc) {
            this.rfc = rfc;
        }

        public double getCredito() {
            return Credito;
        }

        public void setCredito(double Credito) {
            this.Credito = Credito;
        }

        @Override
        public String GenDatos() {
            return super.GenDatos() + "RFC: " + rfc + "\n" + "CREDITO: " + Credito;
        }  
    }
