import java.util.ArrayList;

public class Belanja {
        private String nama;
        private int customer;
        private int jumlah;

        public Belanja(){}

        public void setNamaBarang(String nama) {
            this.nama = nama;
        }

        public void setHargaBarang(int harga) {
            this.customer = harga;
        }

        public void setJumBarang(int jumlah){
            this.jumlah = jumlah;
        }

        public String nama(){
            return this.nama;
        }

        public int harga() {
            return this.customer;
        }

        public int jumlah(){
            return this.jumlah;
        }

        public Object CetakInvoice(ArrayList<Belanja> barang){
            int total = 0;
            for (Belanja item : barang) {
                System.out.println(item.nama());
                System.out.println(item.jumlah() + " * " + item.harga());
                total += (item.harga() * item.jumlah());
            }
            return null;
        }

    public void setJumBelanja(int nextInt) {
    }
}
