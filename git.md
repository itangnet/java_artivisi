# Version Control #


Macam-macam tempat penyimpanan file:

* Windows explorer
* Windows file sharing
* FTP Server

Keterbatasan:

* tidak ada proteksi overwrite (menimpa file)
* tidak ada history
* tidak ada tag (penamaan versi)
* tidak cocok buat development aplikasi

Version control : tempat penyimpanan file dengan fitur khusus:

* mencatat history perubahan

    * content : data yang lama dan data yang baru
    * waktu
    * pelaku
    * keterangan

* kembali ke titik manapun di masa lalu
* tagging (memberi nama) versi tertentu
* merge : menggabungkan perubahan pada file

Aplikasi Version Control: 

* Centralized : database terpusat di satu mesin / server

    * CVS
    * Subversion

* Distributed Version Control : tiap orang punya database sendiri
    * Git
    * Mercurial
    * Bazaar


Service Provider Version Control

* [Github](https://github.com) : gratis asal public. Bayar sesuai private repo.
* [Bitbucket](https://bitbucket.org) : gratis public maupun private. Bayar sesuai team member.
* SourceForge

Aplikasi Server

* [Gitolite](http://gitolite.com/gitolite/index.html) : command line, tidak ada UI, edit text file untuk konfigurasi
* [Gitblit](http://www.gitblit.com/) : web based, java, tampilan jelek
* [Gitlab](https://about.gitlab.com/) : web based, tampilan bagus, instalasi sulit

## Menggunakan Git ##

* Membuat repository baru

    ```
    git init namafolder
    ```

* Mengambil repository yang sudah ada di Github

    ```
    git clone <url>
    ```


