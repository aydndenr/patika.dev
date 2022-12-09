# Proje 1
## Selection Sort Projesi



## Adımlar

- İlk sıradaki eleman teker teker diğer elemanlar ile karşılaştırılır.
- Kendinden küçük bir eleman ile karşılaşırsa bu elemana yerini verip sağa kayar.
- Tekrar bu küçük elemanla karşılaştırmalara devam ederiz liste bitene kadar.
- Nihayetinde en başa en küçük eleman geçmiş olur. Ve ondan büyük en küçük eleman için devam ederiz.
- Aynı işlemleri tüm elemanlar için yaptığımızda istediğimiz sonuca ulaşmış oluruz.

## Big O
O(n^2)

## Dizi sıralandığında 18 sayısı avarage case verir.

# [7,3,5,8,2,9,4,15,6]
### [2,3,5,8,7,9,4,15,6]
### [2,3,5,8,7,9,4,15,6]
### [2,3,4,8,7,9,5,15,6]
### [2,3,4,5,7,9,8,15,6]
### [2,3,4,5,6,9,8,15,7]