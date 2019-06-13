using System;

namespace CSdemo.Assign6
{
    public class KeyValueDemo
    {

        public static void Main(string[] args)
        {
            KeyValue<int, string> entry = new KeyValue<int, string>(0373408185, "Huy");

            int phone = entry.GetKey();

            string name = entry.GetValue();
            
            Console.WriteLine("Phone="+phone + "/name = "+name);

            Console.Read();
        }
    }
}