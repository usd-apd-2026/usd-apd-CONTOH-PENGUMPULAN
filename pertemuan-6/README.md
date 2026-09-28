# Pertemuan 1

## Tabel Rancangan
	| Elemen | Rancangan contoh |
| ----------- | ----------- |
| Problem statement | Diberikan nilai jari-jari suatu lingkaran, tentukan luas lingkaran tersebut. |
| Input | jariJari |
| Process | `luas = PHI × jariJari × jariJari` (dengan nilai konstanta $\text{PHI} = 3.14159$). |
| Output | `luas` (hasil kalkulasi luas lingkaran). |
| Asumsi | Lingkaran sempurna berada pada bidang dua dimensi; nilai $\pi$ (PHI) didefinisikan secara konstan sebesar $3.14159$. |
| Batasan | Input `jariJari` harus berupa angka real positif ($>0$). |
| Modul | Input & validasi; hitung luas lingkaran; tampilkan hasil. |


## PsuedoCode
```
PROGRAM Menghitung_Luas_Lingkaran

PHI : double = 3.14159
jariJari : double
luas : double

PRINT "Masukkan jari-jari lingkaran: "
BACA jariJari

luas = PHI * jariJari * jariJari

PRINT "Luas lingkaran adalah: ", luas
END
```

## Flowchart
![image](flow_chart.jpg)
