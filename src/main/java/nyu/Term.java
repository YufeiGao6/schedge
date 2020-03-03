package nyu;

import java.util.Objects;

public final class Term {
  public final int semester;
  public final int year;

  public static final int JANUARY = 2;
  public static final int SPRING = 4;
  public static final int SUMMER = 6;
  public static final int FALL = 8;

  public Term(String sem, int year) { this(semesterFromString(sem), year); }

  public Term(int semester, int year) {
    assert semester == 2 || semester == 4 || semester == 6 ||
        semester == 8 : "Semester was invalid: " + semester;
    assert year >= 1900 : "Year was invalid: " + year;

    this.semester = semester;
    this.year = year - 1900;
  }

  public static Term fromId(int id) {
    int semester = id % 10;
    return new Term(semester, id / 10 + 1900);
  }

  public static int semesterFromString(String sem) {
    switch (sem.toLowerCase()) {
    case "ja":
    case "january":
      return 2;
    case "sp":
    case "spring":
      return 4;
    case "su":
    case "summer":
      return 6;
    case "fa":
    case "fall":
      return 8;
    default:
      throw new IllegalArgumentException("Invalid semester string: " + sem);
    }
  }

  public static String semesterToString(int sem) {
    switch (sem) {
    case 2:
      return "January";
    case 4:
      return "Spring";
    case 6:
      return "summer";
    case 8:
      return "fall";
    default:
      throw new IllegalArgumentException("Invalid semester value: " + sem);
    }
  }

  public Term prevTerm() {
    if (semester == JANUARY)
      return new Term(FALL, year - 1);
    else
      return new Term(semester - 2, year);
  }

  public Term nextTerm() {
    if (semester == FALL)
      return new Term(JANUARY, year + 1);
    else
      return new Term(semester + 2, year);
  }

  public int getId() { return year * 10 + semester; }

  public String toString() {
    return "Term(" + semesterToString(semester) + ',' + (year + 1900) + ")";
  }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Term term = (Term) o;
        return semester == term.semester &&
                year == term.year;
    }

    @Override
    public int hashCode() {
        return Objects.hash(semester, year);
    }
}
