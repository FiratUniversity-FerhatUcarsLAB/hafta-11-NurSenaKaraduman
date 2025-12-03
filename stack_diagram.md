# Exercise 4.3 – Stack Diagram & Program Output

###  Stack Diyagramı

(main calisti)
└── zoop()
    └── baffle()
        └── ping() ← su an aktif olan

---

### 📌 Programın Ürettiği tam çıktı

No, I wug.
You wugga wug.
I wug.

---


`ping()` her çağrıldığında sadece `"."` yazdırır,
`baffle()` → `"wug" + ping()` üretir,
`zoop()` → `baffle() → "You wugga " → baffle()` akışında çalışır.
