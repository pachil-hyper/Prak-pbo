class Pegawai {
    public String nama;
    private String npwp;
    protected String mataKuliah; 
    
    Pegawai(String paramNama, String paramNpwp, String paramMatakuliah) {
        this.nama = paramNama;
        this.npwp = paramNpwp;
        this.mataKuliah = paramMatakuliah;
    } 

    public void tampilData() {
        System.out.println("Nama             : " + nama);
        System.out.println("Npwp             : " + npwp);
        System.out.println("Mata Kuliah      : " + mataKuliah); 
    }

    private void mengajar() {
        System.out.println("Dosen " + nama + " sedang mengajar " + mataKuliah);
    }

    protected void istirahat() {
        System.out.println("Dosen " + nama + " sedang istirahat");
    }
}
