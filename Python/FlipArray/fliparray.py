import numpy

def arrays(arr):
    # complete this function
    # use numpy.array
    b = numpy.array(arr,float)
    #potser esperen fer servir el flip de numpy
    #pero he llegit que es mes eficient el següent metode
    b_rev = b[::-1]
    return b_rev

arr = raw_input().strip().split(' ')
result = arrays(arr)
print(result)
