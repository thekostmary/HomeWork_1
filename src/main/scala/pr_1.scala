object pr_1 {
def lastBuiltin[A](ls: List [A]): A = ls.last
  def main (args: Array[String]): Unit = {
    print (lastBuiltin(List(1,1,2,3,5,6)))
  }
}
//Задача 1 Найти последний элемент списка