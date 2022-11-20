public enum Weekable {
    ДУЙШОМБУ("Technical English , Technical Lesson "),
    ШЕЙШЕМБИ("Practice Lesson , Talking Club(Beg) "),
    ШАРШЕМБИ("Talking Club(Adv) , Technical Lesson"),
    БЕЙШЕМБИ("Practic Lesson , Soft Skills"),
    ЖУМА("Event , Technical Lesson"),
    ИШЕМБИ("DAy off"),
    ЖЕКШЕМБИ("DAy off"),
    ;

    private String Timetable;

    Weekable(String timetable) {
        Timetable = timetable;
    }

    public String getTimetable() {
        return Timetable;
    }

    public void setTimetable(String timetable) {
        Timetable = timetable;
    }

}
