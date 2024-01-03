    package com.example.home3;

    public class ProductDataModel {
        private String name;
        //String images;
         //int price;
         //String location;
        private String course;

        public ProductDataModel(){

        }

        public ProductDataModel(String name,String course) {
            this.name = name;
            //this.images = images;
           // this.price = price;
            this.course = course;
        }

        public  String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }

//        public String getImages() {
//            return images;
//        }

        //public void setImages(String images) {
            //this.images = images;
        //}

        //public  int getPrice() {
           // return price;
        //}

       // public void setPrice(int price) {
            //this.price = price;
        //}

        public  String getCourse() {
            return course;
        }

        public void setCourse(String course) {
            this.course = course;
        }
    }


