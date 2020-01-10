import java.util.ArrayList;

//����һ�����鰲����һ����ȫ�������У�����һ�����ڵ��index��i����ô���������ӽڵ��index�ֱ�Ϊ2i+1����2i+2��
class BinaryHeap<Item extends Comparable>{
	ArrayList<Item> list = new ArrayList<Item>();
	public Item top() {
		return list.get(0);
	}
	//���ص�һ�����������һ���ŵ���һ��������������Ǳ
	public Item pop() {
		if(list.size()==0)return null;
		Item result = top();
		list.remove(0);
		if(list.size()>0)
		{
			list.add(0,list.get(list.size()-1));
			list.remove(list.size()-1);
			dive(0);
		}
		return result;
	}
	
	public void insert(Item a)
	{
		list.add(a);
		reorder(list.size()-1);
	}
	//�ӵ�k����ʼ��Ǳ
	public void dive(int k)
	{
		while(2*k+1<=list.size()-1)
		{
			//���ӽڵ�
			int exchangechild = 2*k+1;
			if(exchangechild+1 <= list.size()-1&&cmp(exchangechild+1,exchangechild))
			{
				exchangechild++;
			}
			if(cmp(exchangechild,k))
			{
				exchange(k,exchangechild);
				k=exchangechild;
				continue;
			}
			else 
				break;
		}
	}
	
	public void reorder(int k)
	{
		while(k>0&&cmp(k,(k-1)/2))
		{
			exchange(k,(k-1)/2);
			k=(k-1)/2;
		}
	}
	
	public boolean cmp(int a, int b)
	{
		Item item1 = list.get(a);
		Item item2 = list.get(b);
		return item1.compareTo(item2)<0;
	}
	public void exchange(int a, int b)
	{
		Item temp = list.get(a);
		list.set(a, list.get(b));
		list.set(b, temp);
	}
	public boolean isempty()
	{
		return list.size()==0;
	}
	//�ö�����ҳ�һ��������ǰk���û��kʱ�������мӣ����˾�����¸�ֵ�ȵ�һ�����Ѵ�����Сֵ���󣬾��滻��һ��
	public void printtopk(int k,Item[] array)
	{
		for(int i=0;i<array.length;i++)
		{
			if(list.size()<k)
			{
				insert(array[i]);
			}
			else
			{
				if(array[i].compareTo(list.get(0))>0)
				{
					list.set(0, array[i]);
					dive(0);
				}
			}
		}
		for(int i=0;i<k;i++)
		{
			System.out.print(list.get(i)+" ");
		}
	}
}
public class ����� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        BinaryHeap<Integer> binaryHeap = new BinaryHeap<>();
        binaryHeap.insert(7);
        binaryHeap.insert(6);
        binaryHeap.insert(34);
        binaryHeap.insert(0);
        binaryHeap.insert(22);
        binaryHeap.insert(7);
        while(!binaryHeap.isempty()){
            System.out.println(binaryHeap.pop());
        }
//        binaryHeap.list = new ArrayList<Integer>();
//        Integer[] a = {2,5,6,7,9,10,5,6,4,23,44};
//        binaryHeap.printtopk(3,a);
        
        

    }
}


