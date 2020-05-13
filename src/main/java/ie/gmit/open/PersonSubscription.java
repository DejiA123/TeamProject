package ie.gmit.open;
public class PersonSubscription {
    private Long personId;
    private String address;
    private Long phoneNumber;
    private int NCT;
    private long Insurance;/*** @return the subscriberId*/
    public Long getPersonId() {
        return personId;
    }/*** @param personId the subscriberId to set*/
    public void setPersonId(Long personId) {
        this.personId = personId;
    }/*** @return the address*/
    public String getAddress() {
        return address;
    }/*** @param address the address to set*/
    public void setAddress(String address) {
        this.address = address;
    }/*** @return the phoneNumber*/
    public Long getPhoneNumber() {
        return phoneNumber;
    }/*** @param phoneNumber the phoneNumber to set*/
    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }/*** @return the NCt*/
    public int getNCT() {
        return NCT;
    }/*** @param NCT the nct to set*/
    public void setNCT(int NCT) {
        this.NCT = NCT;
    }/*** @return the insurance*/
    public long getInsurance() {
        return Insurance;
    }/*** @param insurance the insurance to set*/
    public void setInsurance(long insurance) {
        this.Insurance = insurance;
    }
    
}