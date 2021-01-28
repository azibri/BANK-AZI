create table `nasabah` (
	`nasabah_id` int (5) primary key not null AUTO_INCREMENT,
	`nasabah_nama` varchar (40) not null,
	`nasabah_alamat` varchar (100) not null,
	`nasabah_tempatlahir` varchar (20) not null,
	`nasabah_tanggallahir` date not null,
	`nasabah_noktp` char (16) not null,
	`nasabah_nohandphone` char (15) not null
) ENGINE=InnoDB DEFAULT CHARSET=latin1;


insert into `nasabah` (`nasabah_nama`, `nasabah_alamat`, `nasabah_tempatlahir`, `nasabah_tanggallahir`, `nasabah_noktp`, `nasabah_nohandphone`) values 
	('Budi Sumarno', 'Jl. Melati No. 8 Grogol, Jakarta Barat', 'Jakarta', '1990/9/9', '1890354628906473', '082374810273'),
	('Ayu Cantika Jelita', 'Jl. Mawar No. 9, Kota Semarang', 'Serang', '1990/8/8', '1837839201847291', '087382916343'),
	('Wijayakusuma Prakoso', 'Jl. Kamboja No. 9, Kota Surabaya', 'Malang', '1989/9/9', '1834739205873018', '083819304752'),
	('Dani Kanda', 'Jl. Jambu No. 8 Kabupaten Sleman', 'Salatiga', '1988/8/8', '1483021847593028', '088291748923');
	