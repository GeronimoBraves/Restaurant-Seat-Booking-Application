package com.example.sfc2;

public class FeedbackInfo {
        private String feedbackName;
        private String feedbackContactNumber;
        private String feedbackEmail;
        private String feedbackLocation;
        private String feedbackDate;
        private String feedbackDine;
        private String feedbackFood;
        private String feedbackOverall;
        private String feedbackSpeed;
        private String feedbackExp;
        private String feedbackComment;
        // an empty constructor is
        // required when using
        // Firebase Realtime Database.
        public FeedbackInfo() {

        }

        // created getter and setter methods
        // for all our variables.
        public String getFeedbackName() {
            return feedbackName;
        }

        public void setFeedbackName(String feedbackName) {
            this.feedbackName = feedbackName;
        }

        public String getFeedbackContactNumber() {
            return feedbackContactNumber;
        }

        public void setFeedbackContactNumber(String feedbackContactNumber) {
            this.feedbackContactNumber = feedbackContactNumber;
        }

        public String getFeedbackEmail() {
            return feedbackEmail;
        }

        public void setFeedbackEmail(String feedbackEmail) {
            this.feedbackEmail = feedbackEmail;
        }
    public String getFeedbackLocation() {
        return feedbackLocation;
    }

    public void setFeedbackLocation(String feedbackLocation) {
        this.feedbackLocation = feedbackLocation;
    }
    public String getFeedbackDate() {
        return feedbackDate;
    }

    public void setFeedbackDate(String feedbackDate) {
        this.feedbackDate = feedbackDate;
    }
    public String getFeedbackDine() {
        return feedbackDine;
    }

    public void setFeedbackDine(String feedbackDine) {
        this.feedbackDine = feedbackDine;
    }
    public String getFeedbackFood() {
        return feedbackFood;
    }

    public void setFeedbackFood(String feedbackFood) {
        this.feedbackFood = feedbackFood;
    }
    public String getFeedbackOverall() {
        return feedbackOverall;
    }

    public void setFeedbackOverall(String feedbackOverall) {
        this.feedbackOverall = feedbackOverall;
    }
    public String getFeedbackSpeed() {
        return feedbackSpeed;
    }

    public void setFeedbackSpeed(String feedbackSpeed) {
        this.feedbackSpeed = feedbackSpeed;
    }
    public String getFeedbackExp() {
        return feedbackExp;
    }

    public void setFeedbackExp(String feedbackExp) {
        this.feedbackExp = feedbackExp;
    }
    public String getFeedbackComment() {
        return feedbackComment;
    }

    public void setFeedbackComment(String feedbackComment) {
        this.feedbackComment = feedbackComment;
    }
}

