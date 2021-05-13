
public class Kullanici implements IKullanici{
	private String kullaniciAdi;
	private String ad;
	private String soyad;
	private String mail;
	
	private Kullanici(KullaniciBuilder builder)
	{
		this.kullaniciAdi=builder.kullaniciAdi;
		this.ad=builder.ad;
		this.soyad=builder.soyad;
		this.mail=builder.mail;
	}
	
	public static class KullaniciBuilder
	{
		private String kullaniciAdi;
		private String ad;
		private String soyad;
		private String mail;
		
		public KullaniciBuilder(String kullaniciAdi)
		{
			this.kullaniciAdi=kullaniciAdi;
		}
		public KullaniciBuilder ad(String ad)
		{
			this.ad=ad;
			return this;
		}
		public KullaniciBuilder soyad(String soyad)
		{
			this.soyad=soyad;
			return this;
		}
		public KullaniciBuilder mail(String mail)
		{
			this.mail=mail;
			return this;
		}
		public Kullanici build()
		{
			return new Kullanici(this);
		}
	}
}
