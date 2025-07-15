-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 15 Jul 2025 pada 01.37
-- Versi server: 10.4.32-MariaDB
-- Versi PHP: 8.0.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_siskrip`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `admin`
--

CREATE TABLE `admin` (
  `id_admin` int(11) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(100) NOT NULL,
  `nama` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `admin`
--

INSERT INTO `admin` (`id_admin`, `username`, `password`, `nama`) VALUES
(1, 'Rifal140', '2304411409', 'Muh Rifal Tawakkal'),
(2, 'Rifal2067', '2304411409', 'RifalTawakkal');

-- --------------------------------------------------------

--
-- Struktur dari tabel `diskusi`
--

CREATE TABLE `diskusi` (
  `id_diskusi` int(11) NOT NULL,
  `nim` varchar(15) DEFAULT NULL,
  `nama_pengirim` varchar(100) DEFAULT NULL,
  `isi_pesan` text DEFAULT NULL,
  `tanggal` datetime DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Struktur dari tabel `dokumen_skripsi`
--

CREATE TABLE `dokumen_skripsi` (
  `id_dokumen` int(11) NOT NULL,
  `nim` varchar(15) DEFAULT NULL,
  `nama_file` varchar(255) DEFAULT NULL,
  `path_file` varchar(255) DEFAULT NULL,
  `tanggal_upload` date DEFAULT NULL,
  `status` varchar(30) DEFAULT 'Menunggu',
  `nilai` varchar(5) DEFAULT NULL,
  `status_validasi` varchar(20) DEFAULT NULL,
  `catatan_validasi` text DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `dokumen_skripsi`
--

INSERT INTO `dokumen_skripsi` (`id_dokumen`, `nim`, `nama_file`, `path_file`, `tanggal_upload`, `status`, `nilai`, `status_validasi`, `catatan_validasi`) VALUES
(1, '2304411409', 'Muh Afrisal_2304411406 3J (t2).docx', 'uploads/Muh Afrisal_2304411406 3J (t2).docx', '2025-07-10', 'Revisi', '100', 'Lulus', 'perbaiki'),
(2, '2304411409', 'TUGAS TECHNOPRENEUR.docx', 'uploads/TUGAS TECHNOPRENEUR.docx', '2025-07-10', 'Ditolak', '100', 'Lulus', 'MANTAP RIFAL'),
(3, 'nim', 'MAKALAH DATA MINING kelompok 3.docx', 'uploads/MAKALAH DATA MINING kelompok 3.docx', '2025-07-11', 'Revisi', NULL, NULL, NULL),
(4, '2304411409', 'MAKALAH DATA MINING kelompok 3.docx', 'uploads/MAKALAH DATA MINING kelompok 3.docx', '2025-07-14', 'Menunggu', NULL, NULL, NULL);

-- --------------------------------------------------------

--
-- Struktur dari tabel `dosen`
--

CREATE TABLE `dosen` (
  `id_dosen` int(11) NOT NULL,
  `username` varchar(50) DEFAULT NULL,
  `password` varchar(100) DEFAULT NULL,
  `nama_dosen` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `dosen`
--

INSERT INTO `dosen` (`id_dosen`, `username`, `password`, `nama_dosen`) VALUES
(1, 'dosen1', 'password123', 'Dosen Satu'),
(2, 'jTextField1', 'jPasswordField1', 'jTextField2'),
(3, 'ateng123', 'trojan123', 'ateng gunawan');

-- --------------------------------------------------------

--
-- Struktur dari tabel `jadwal_bimbingan`
--

CREATE TABLE `jadwal_bimbingan` (
  `id_jadwal` int(11) NOT NULL,
  `nim` varchar(15) DEFAULT NULL,
  `tanggal` date DEFAULT NULL,
  `waktu` time DEFAULT NULL,
  `keterangan` varchar(100) DEFAULT NULL,
  `status` varchar(20) DEFAULT 'Menunggu'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `jadwal_bimbingan`
--

INSERT INTO `jadwal_bimbingan` (`id_jadwal`, `nim`, `tanggal`, `waktu`, `keterangan`, `status`) VALUES
(1, '2304411409', '2025-07-01', '09:00:00', 'Keterangan', 'Diterima'),
(2, '2304411409', '2025-07-01', '09:00:00', NULL, 'Ditolak'),
(3, '2304411409', '2025-07-01', '09:00:00', NULL, 'Belum'),
(4, '2304411409', '2025-07-01', '08:00:00', NULL, 'Selesai'),
(5, '2304411409', '2025-07-03', '08:00:00', 'gassssss', 'Menunggu');

-- --------------------------------------------------------

--
-- Struktur dari tabel `konten`
--

CREATE TABLE `konten` (
  `id_konten` int(11) NOT NULL,
  `judul` varchar(100) NOT NULL,
  `tipe` varchar(30) DEFAULT NULL,
  `isi` text DEFAULT NULL,
  `file_link` varchar(255) DEFAULT NULL,
  `tgl_update` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `konten`
--

INSERT INTO `konten` (`id_konten`, `judul`, `tipe`, `isi`, `file_link`, `tgl_update`) VALUES
(1, 'Jangan Sedih', 'Pengumuman', 'tidakji', 'apara iyana', '2025-07-11 11:56:24');

-- --------------------------------------------------------

--
-- Struktur dari tabel `log_aktivitas`
--

CREATE TABLE `log_aktivitas` (
  `id_log` int(11) NOT NULL,
  `username` varchar(50) DEFAULT NULL,
  `tipe` varchar(20) DEFAULT NULL,
  `nim` varchar(20) DEFAULT NULL,
  `nidn` varchar(20) DEFAULT NULL,
  `aktivitas` varchar(100) DEFAULT NULL,
  `deskripsi` text DEFAULT NULL,
  `waktu` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Struktur dari tabel `mahasiswa`
--

CREATE TABLE `mahasiswa` (
  `nim` varchar(15) NOT NULL,
  `nama` varchar(100) DEFAULT NULL,
  `status_tahapan` varchar(50) DEFAULT NULL,
  `jadwal_bimbingan` varchar(50) DEFAULT NULL,
  `feedback` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `mahasiswa`
--

INSERT INTO `mahasiswa` (`nim`, `nama`, `status_tahapan`, `jadwal_bimbingan`, `feedback`) VALUES
('2304411409', 'Muh Rifal Tawakkal', 'masih', '13.00', 'oke bosku');

-- --------------------------------------------------------

--
-- Struktur dari tabel `notifikasi`
--

CREATE TABLE `notifikasi` (
  `id_notif` int(11) NOT NULL,
  `nim` varchar(20) DEFAULT NULL,
  `tipe` varchar(30) DEFAULT NULL,
  `pesan` text DEFAULT NULL,
  `waktu` datetime DEFAULT NULL,
  `status_baca` tinyint(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Struktur dari tabel `pengaduan`
--

CREATE TABLE `pengaduan` (
  `id_pengaduan` int(11) NOT NULL,
  `email_user` varchar(100) DEFAULT NULL,
  `pesan` text DEFAULT NULL,
  `waktu` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `pengaduan`
--

INSERT INTO `pengaduan` (`id_pengaduan`, `email_user`, `pesan`, `waktu`) VALUES
(1, 'rifal@gmail.com', 'jangan lupa bahagia', '2025-07-11 15:28:37');

-- --------------------------------------------------------

--
-- Struktur dari tabel `pengaturan_aplikasi`
--

CREATE TABLE `pengaturan_aplikasi` (
  `id_pengaturan` int(11) NOT NULL,
  `nama_aplikasi` varchar(100) DEFAULT NULL,
  `nama_kampus` varchar(100) DEFAULT NULL,
  `alamat` varchar(200) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `telepon` varchar(20) DEFAULT NULL,
  `logo_path` varchar(200) DEFAULT NULL,
  `tema` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `pengaturan_aplikasi`
--

INSERT INTO `pengaturan_aplikasi` (`id_pengaturan`, `nama_aplikasi`, `nama_kampus`, `alamat`, `email`, `telepon`, `logo_path`, `tema`) VALUES
(1, 'Whastapp', 'uncp', 'iuyuoyo', 'rufsuf@gmail.com', '08008989', 'C:\\Users\\ernia\\OneDrive\\Tài liệu\\inputdata.csv', 'Dark');

-- --------------------------------------------------------

--
-- Struktur dari tabel `pengguna`
--

CREATE TABLE `pengguna` (
  `id_pengguna` int(11) NOT NULL,
  `username` varchar(20) NOT NULL,
  `password` varchar(100) NOT NULL,
  `nama` varchar(100) DEFAULT NULL,
  `tipe` varchar(20) DEFAULT NULL,
  `nim` varchar(20) DEFAULT NULL,
  `nidn` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `pengguna`
--

INSERT INTO `pengguna` (`id_pengguna`, `username`, `password`, `nama`, `tipe`, `nim`, `nidn`) VALUES
(5, '2304411450', '12345678', 'pirkan', 'mahasiswa', '2304411450', NULL),
(6, 'Nim', 'jPasswordField1', 'Nama', 'mahasiswa', 'Nim', NULL),
(7, '2304411409', '098765', 'Muh Iqra', 'mahasiswa', '2304411409', NULL),
(8, '2304411407', '12345678', 'Muh Amal', 'mahasiswa', '2304411407', NULL);

-- --------------------------------------------------------

--
-- Struktur dari tabel `progres_skripsi`
--

CREATE TABLE `progres_skripsi` (
  `id_progres` int(11) NOT NULL,
  `nim` varchar(20) NOT NULL,
  `tahap` varchar(50) NOT NULL,
  `status` varchar(20) NOT NULL,
  `keterangan` text DEFAULT NULL,
  `tgl_update` datetime DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `progres_skripsi`
--

INSERT INTO `progres_skripsi` (`id_progres`, `nim`, `tahap`, `status`, `keterangan`, `tgl_update`) VALUES
(4, '2304411409', 'Bimbingan', 'Revisi', 'perbaiaki', '2025-07-11 00:01:56');

-- --------------------------------------------------------

--
-- Struktur dari tabel `topik`
--

CREATE TABLE `topik` (
  `id_topik` int(11) NOT NULL,
  `judul_topik` varchar(255) DEFAULT NULL,
  `status` varchar(30) DEFAULT 'Menunggu'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `topik`
--

INSERT INTO `topik` (`id_topik`, `judul_topik`, `status`) VALUES
(2, 'Terbinanya Mahasiswa Teladan Yang Penuh Dengan Kesopanan yang diinginkan dan ditelusuri', 'Disetujui'),
(3, '', 'Menunggu');

-- --------------------------------------------------------

--
-- Struktur dari tabel `umpan_balik`
--

CREATE TABLE `umpan_balik` (
  `id_umpan` int(11) NOT NULL,
  `id_dokumen` int(11) DEFAULT NULL,
  `tanggal_umpan` date DEFAULT NULL,
  `isi_umpan` text DEFAULT NULL,
  `dosen` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `umpan_balik`
--

INSERT INTO `umpan_balik` (`id_umpan`, `id_dokumen`, `tanggal_umpan`, `isi_umpan`, `dosen`) VALUES
(1, 2, '2025-07-10', 'perbaiki', 'Dosen Satu'),
(2, 1, '2025-07-10', 'perbaiki ya', 'Dosen Satu'),
(3, 3, '2025-07-11', 'mantap', 'Dosen Satu'),
(4, 3, '2025-07-14', 'Marginnya Di perbaiki lagi dek', 'Dosen Satu'),
(5, 3, '2025-07-14', 'perbaiki lagi dek, jelek sekali', 'Dosen Satu');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`id_admin`),
  ADD UNIQUE KEY `username` (`username`);

--
-- Indeks untuk tabel `diskusi`
--
ALTER TABLE `diskusi`
  ADD PRIMARY KEY (`id_diskusi`);

--
-- Indeks untuk tabel `dokumen_skripsi`
--
ALTER TABLE `dokumen_skripsi`
  ADD PRIMARY KEY (`id_dokumen`);

--
-- Indeks untuk tabel `dosen`
--
ALTER TABLE `dosen`
  ADD PRIMARY KEY (`id_dosen`),
  ADD UNIQUE KEY `username` (`username`);

--
-- Indeks untuk tabel `jadwal_bimbingan`
--
ALTER TABLE `jadwal_bimbingan`
  ADD PRIMARY KEY (`id_jadwal`);

--
-- Indeks untuk tabel `konten`
--
ALTER TABLE `konten`
  ADD PRIMARY KEY (`id_konten`);

--
-- Indeks untuk tabel `log_aktivitas`
--
ALTER TABLE `log_aktivitas`
  ADD PRIMARY KEY (`id_log`);

--
-- Indeks untuk tabel `mahasiswa`
--
ALTER TABLE `mahasiswa`
  ADD PRIMARY KEY (`nim`);

--
-- Indeks untuk tabel `notifikasi`
--
ALTER TABLE `notifikasi`
  ADD PRIMARY KEY (`id_notif`);

--
-- Indeks untuk tabel `pengaduan`
--
ALTER TABLE `pengaduan`
  ADD PRIMARY KEY (`id_pengaduan`);

--
-- Indeks untuk tabel `pengaturan_aplikasi`
--
ALTER TABLE `pengaturan_aplikasi`
  ADD PRIMARY KEY (`id_pengaturan`);

--
-- Indeks untuk tabel `pengguna`
--
ALTER TABLE `pengguna`
  ADD PRIMARY KEY (`id_pengguna`);

--
-- Indeks untuk tabel `progres_skripsi`
--
ALTER TABLE `progres_skripsi`
  ADD PRIMARY KEY (`id_progres`);

--
-- Indeks untuk tabel `topik`
--
ALTER TABLE `topik`
  ADD PRIMARY KEY (`id_topik`);

--
-- Indeks untuk tabel `umpan_balik`
--
ALTER TABLE `umpan_balik`
  ADD PRIMARY KEY (`id_umpan`),
  ADD KEY `id_dokumen` (`id_dokumen`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `admin`
--
ALTER TABLE `admin`
  MODIFY `id_admin` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT untuk tabel `diskusi`
--
ALTER TABLE `diskusi`
  MODIFY `id_diskusi` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;

--
-- AUTO_INCREMENT untuk tabel `dokumen_skripsi`
--
ALTER TABLE `dokumen_skripsi`
  MODIFY `id_dokumen` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT untuk tabel `dosen`
--
ALTER TABLE `dosen`
  MODIFY `id_dosen` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT untuk tabel `jadwal_bimbingan`
--
ALTER TABLE `jadwal_bimbingan`
  MODIFY `id_jadwal` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT untuk tabel `konten`
--
ALTER TABLE `konten`
  MODIFY `id_konten` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT untuk tabel `log_aktivitas`
--
ALTER TABLE `log_aktivitas`
  MODIFY `id_log` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT untuk tabel `notifikasi`
--
ALTER TABLE `notifikasi`
  MODIFY `id_notif` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT untuk tabel `pengaduan`
--
ALTER TABLE `pengaduan`
  MODIFY `id_pengaduan` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT untuk tabel `pengaturan_aplikasi`
--
ALTER TABLE `pengaturan_aplikasi`
  MODIFY `id_pengaturan` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT untuk tabel `pengguna`
--
ALTER TABLE `pengguna`
  MODIFY `id_pengguna` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT untuk tabel `progres_skripsi`
--
ALTER TABLE `progres_skripsi`
  MODIFY `id_progres` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT untuk tabel `topik`
--
ALTER TABLE `topik`
  MODIFY `id_topik` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT untuk tabel `umpan_balik`
--
ALTER TABLE `umpan_balik`
  MODIFY `id_umpan` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `umpan_balik`
--
ALTER TABLE `umpan_balik`
  ADD CONSTRAINT `umpan_balik_ibfk_1` FOREIGN KEY (`id_dokumen`) REFERENCES `dokumen_skripsi` (`id_dokumen`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
