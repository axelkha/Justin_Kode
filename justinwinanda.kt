class Produk(val nama: String, var harga: Double, var stok: Int) {

    // Fungsi untuk menampilkan informasi detail produk
    fun tampilkanInfo() {
        println("Nama Produk: $nama")
        println("Harga: Rp$harga")
        println("Stok Tersedia: $stok unit")
    }

    // Fungsi untuk membeli produk dan mengurangi stok
    fun beliProduk(jumlah: Int) {
        if (jumlah <= stok) {
            stok -= jumlah
            println("Anda telah membeli $jumlah $nama. Stok tersisa: $stok")
        } else {
            println("Stok tidak mencukupi! Hanya tersisa $stok unit.")
        }
    }
}

fun main() {
    // Membuat objek produk
    val produk1 = Produk("Smartphone", 2500000.0, 20)

    // Menampilkan informasi produk
    produk1.tampilkanInfo()

    // Simulasi pembelian produk
    produk1.beliProduk(5)

    // Menampilkan kembali informasi produk setelah pembelian
    produk1.tampilkanInfo()
}
