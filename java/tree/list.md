## Java List集合：ArrayList和LinkedList类的用法及区别
### ArrayList 类
ArrayList 类实现了可变数组的大小，存储在内的数据称为元素。它还提供了快速基于索引访问元素的方式，对尾部成员的增加和删除支持较好。使用 ArrayList 创建的集合，允许对集合中的元素进行快速的随机访问，不过，向 ArrayList 中插入与删除元素的速度相对较慢。

ArrayList 类的常用构造方法有如下两种重载形式：
ArrayList()：构造一个初始容量为 10 的空列表。
ArrayList(Collection<?extends E>c)：构造一个包含指定 Collection 元素的列表，这些元素是按照该 Collection 的迭代器返回它们的顺序排列的。
E get(int index)	获取此集合中指定索引位置的元素，E 为集合中元素的数据类型
int index(Object o)	返回此集合中第一次出现指定元素的索引，如果此集合不包含该元
素，则返回 -1
int lastIndexOf(Object o)	返回此集合中最后一次出现指定元素的索引，如果此集合不包含该
元素，则返回 -1
E set(int index, Eelement)	将此集合中指定索引位置的元素修改为 element 参数指定的对象。
此方法返回此集合中指定索引位置的原元素
List<E> subList(int fromlndex, int tolndex)	返回一个新的集合，新集合中包含 fromlndex 和 tolndex 索引之间
的所有元素。包含 fromlndex 处的元素，不包含 tolndex 索引处的
元素
### LinkedList类
LinkedList 类采用链表结构保存对象，这种结构的优点是便于向集合中插入或者删除元素。需要频繁向集合中插入和删除元素时，使用 LinkedList 类比 ArrayList 类效果高，但是 LinkedList 类随机访问元素的速度则相对较慢。这里的随机访问是指检索集合中特定索引位置的元素。
void addFirst(E e)	将指定元素添加到此集合的开头
void addLast(E e)	将指定元素添加到此集合的末尾
E getFirst()	返回此集合的第一个元素
E getLast()	返回此集合的最后一个元素
E removeFirst()	删除此集合中的第一个元素
E removeLast()	删除此集合中的最后一个元素