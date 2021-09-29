public class TrancheAge {
    private Integer code;
    private Integer ageMin;
    private Integer ageMax;

    public TrancheAge(Integer code, Integer ageMin, Integer ageMax) {
        this.code = code;
        this.ageMin = ageMin;
        this.ageMax = ageMax;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Integer getAgeMin() {
        return ageMin;
    }

    public void setAgeMin(Integer ageMin) {
        this.ageMin = ageMin;
    }

    public Integer getAgeMax() {
        return ageMax;
    }

    public void setAgeMax(Integer ageMax) {
        this.ageMax = ageMax;
    }
}
