import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class PostgreSqlSurucu implements IVeritabaniSurucu {
	
	@Override
	public IKullanici kullaniciDogrula(String kullaniciAdi, String sifre) {
		IKullanici kullanici =null;
		try
		{
			Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/AkilliCihaz","postgres",/* Veritabanı Şifresi */);
			String sql ="SELECT * FROM \"Kullanici\" WHERE \"kullanici_adi\" LIKE "+ "'"+kullaniciAdi+ "'" +" AND \"sifre\" LIKE "+"'"+sifre+ "'";
		
			Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            
           conn.close();
           
           String kAd;
           String ad;
           String soyad;
           String mail;
           
           while(rs.next())
           {
        	  kAd= rs.getString("kullanici_adi");
        	  ad =rs.getString("ad");
        	  soyad=rs.getString("soyad");
        	  mail= rs.getString("mail");
        	  
        	  kullanici = new Kullanici.KullaniciBuilder(kAd)
        			  .ad(ad)
        			  .soyad(soyad)
        			  .mail(mail)
        			  .build();
           }
            rs.close();
            stmt.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return kullanici;
	}
}
