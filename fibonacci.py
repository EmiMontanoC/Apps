def fibbonacci(x):
    if x>0:
        if x==1:
            return 1
        elif x<=0:
            return 0
        else:
            return fibbonacci(x-1)+fibbonacci(x-2)
    else:
        if x==-1:
            return 1
        elif x>=0:
            return 0
        else:
            return fibbonacci(x+2)-fibbonacci(x+1)
def fib_seq(x):
    if x<0:
        y=abs(x)
        for i in  range(x,y+1):
            print(f"Posicion {i}: {fibbonacci(i)}\n")
    else:
        for i in  range(x+1):
            print(f"Posicion {i}: {fibbonacci(i)}\n")
while True:
    print("|-------------------|")
    print("|     Fibonacci     |")
    print("|-------------------|")
    brk=int(input("Do you want to exit(Yes=1,No=any key:)"))
    if brk==1:
        break
    num=int(input("Proporcione un numero: "))
    fib_seq(num)