namespace CSdemo.assign3
   {
    public class Product
    {
        private int id;
        private string name;
        private decimal price;
        private int qty;
        private string image;
        private string desc;
        private List<string>gallery;

        public int Id
        {
            get => id;
            set => id = value;
        }

        public string Name
        {
            get => name;
            set => name = value;
        }

        public decimal Price
        {
            get => price;
            set => price = value;
        }

        public int Qty
        {
            get => qty;
            set => qty = value;
        }

        public string Image
        {
            get => image;
            set => image = value;
        }

        public string Desc
        {
            get => desc;
            set => desc = value;
        }

        public void GetInfo()
        { 
            Console.WriteLine("Name: "+Name);
            Console.WriteLine("Price: "+Price);
            Console.WriteLine("Qty: "+Qty);
            Console.WriteLine("Image: "+Image);
            Console.WriteLine("Desc: "+Desc);
            Console.WriteLine("Gallery :");
            foreach (string s in gallery)
            {
                Console.WriteLine(s);
            }
        }

        public bool CheckStock()
        {
            if (Qty > 0)
            {
                return true;
            }

            return false;
        }


        public void checkStock()
        {
            if (Qty > 0)
            {
                Console.WriteLine("in-stock");
                return;
            }
        }

        public Product()
        {
        }

        public Product(int id, string name, decimal price, int qty, string image, string desc)
        {
            this.id = id;
            this.name = name;
            this.price = price;
            this.qty = qty;
            this.image = image;
            this.desc = desc;
            this.gallery = new List<string>();
        }

        public void AddImageToGallery(string image)
        {
            if (gallery.Count >= 10)
            {
                Console.WriteLine("max 10 images");
                return;
            }

            gallery.Add(image);
            Console.WriteLine("add image success.");
        }

        public void RemoveImageFromGallery()
        {
            int i = 0;
            foreach (string s gallery)
            {
                Console.WriteLine(i+"."+s);
                i++;
            }
            Console.WriteLine("Choose image :");
            int x = Convert.ToInt16(Console.ReadLine());
            gallery.RemoveAt(x);
            Console.WriteLine("Delete success..");
        }

        public void RemoveImage2(string image)
        {
            gallery.Remove(image);
        }

    }
}
    
    
