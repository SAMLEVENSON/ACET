def ca_nu(num):
    if num <=1:
         return 1
   
    r_num = 0
    for i in range(num):
        r_num += ca_nu(i) * ca_nu(num-i-1)
    return res_num
 
for n in range(10):
    print(ca_nu(n))
