public class Student extends Person {

  private float gpa;
  
  public float getGpa() {
    return this.gpa;
  }
  
  public void setGpa(float gpa) {
    this.gpa = gpa;
  }
  
  public String getAdSoyad() {
    StringBuffer sb = new StringBuffer();
    sb.append(this.ad);
    sb.append(this.soyad);
    return sb.toString();
  }
}
