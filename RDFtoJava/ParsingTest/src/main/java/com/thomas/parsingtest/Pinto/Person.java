package com.thomas.parsingtest.Pinto;

import com.google.common.base.Objects;


public final class Person {
        private String mName;

        public Person() {
        }
        public Person(final String theName) {
            mName = theName;
        }

        public String getName() {
            return mName;
        }

        public void setName(final String theName) {
            mName = theName;
        }

        @Override
        public int hashCode() {
            return Objects.hashCode(mName);
        }

        @Override
        public boolean equals(final Object theObj) {
            if (theObj == this) {
                return true;
            }
            else if (theObj instanceof Person) {
                return Objects.equal(mName, ((Person) theObj).mName);
            }
            else {
                return false;
            }
        }
    }
