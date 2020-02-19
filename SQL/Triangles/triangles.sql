/*
Enter your query here.
Please append a semicolon ";" at the end of the query and enter your query in a single line to avoid error.

select a,b,c,
*/
select 
    case 
        when (a+b<=c) or (a+c<=b) or (b+c<=a) then 'Not A Triangle'
        when (a=b) and (a=c) and (b=c) then 'Equilateral'
        when (a<>b) and (a<>c) and (b<>c) then 'Scalene'
        else
            'Isosceles'
        end
from TRIANGLES ;
