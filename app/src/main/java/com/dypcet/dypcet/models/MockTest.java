package com.dypcet.dypcet.models;

public class MockTest {
    String physics;
    String chemistry;
    String pcm;
    String mathematics;

    public MockTest() {
    }

    public MockTest(String physics, String chemistry, String pcm, String mathematics) {
        this.physics = physics;
        this.chemistry = chemistry;
        this.pcm = pcm;
        this.mathematics = mathematics;
    }

    @Override
    public String toString() {
        return "MockTest{" +
                "physics='" + physics + '\'' +
                ", chemistry='" + chemistry + '\'' +
                ", pcm='" + pcm + '\'' +
                ", mathematics='" + mathematics + '\'' +
                '}';
    }

    public String getPhysics() {
        return physics;
    }

    public void setPhysics(String physics) {
        this.physics = physics;
    }

    public String getChemistry() {
        return chemistry;
    }

    public void setChemistry(String chemistry) {
        this.chemistry = chemistry;
    }

    public String getPcm() {
        return pcm;
    }

    public void setPcm(String pcm) {
        this.pcm = pcm;
    }

    public String getMathematics() {
        return mathematics;
    }

    public void setMathematics(String mathematics) {
        this.mathematics = mathematics;
    }
}
