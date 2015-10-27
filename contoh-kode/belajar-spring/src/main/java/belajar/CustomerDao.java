package belajar;

import org.springframework.beans.factory.annotation.Autowired;

public class CustomerDao {
    private KoneksiDatabase koneksi;

    @Autowired
    public void setKoneksiDatabase(KoneksiDatabase k){
        koneksi = k;
    }

    public void simpan(Customer c){
        String sql = "insert into t_customer";
        koneksi.jalankan(sql);
    }

    public void hapus(Customer c){
        String sql = "delete from t_customer";
        koneksi.jalankan(sql);
    }
}
