namespace CSdemo.Assign6
{
    public class MyGenericList 
    {
        public class KeyValue<K, V>
        {
            private K key;
            private V value;

            public KeyValue(K key, V value)
            {
                this.key = key;
                this.value = value;
                
            }

            public K GetKey()
            {
                return key;
            }

            public void SetKey(K key)
            {
                this.key = key;
            }

            public V GetValue()
            {
                return value;
            }

            public void SetValue(V value)
            {
                this.value = value;
            }
        }
    }
}