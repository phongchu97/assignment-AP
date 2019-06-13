#include <iostream>
#include <cmath>
using namespace std;


namespace CSdemo.Assign1
{
    public class Class
    {
        int snt(int x)
        {
            if (x < 2)
                return 0;
            for (int i = 2; i <= sqrt(x); i++)
                if (x%i == 0)
                    return 0;
            return 1;
        }
 
        
}