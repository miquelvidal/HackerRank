# Enter your code here. Read input from STDIN. Print output to STDOUT
#Reutilitzem l'exercici previ de d'arrays
import numpy

def reforma(arr):
    #passem a enters
    arr_int = numpy.array(arr,int)
    # fem el reshape aqui mateix
    return numpy.reshape(arr_int,[3,3])

arr = raw_input().strip().split(' ')
result = reforma(arr)
print(result)

