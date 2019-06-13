namespace CSdemo.Assign1
{
    public class Main
    {

        int main()
        {
            int n;
            cin >> n;
            for (int i = 1; i < n; i++)
                if (snt(i))
                    cout << i << " ";
            system("pause");
            return 0;
        }
    }
}