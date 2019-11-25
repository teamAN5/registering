package com.lti.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
	@Table(name="PRODUCT_INFORMATION")
	public class Product {
		@Id
		@Column(name="PROD_ID")
		private int productId;
		@Column(name="PRODUCT_NAME")
		private String productName;
		@Column(name="PRODUCT_INFO")
		private String productInfo;
		@Column(name="AMOUNT")
		
		private String productImage;
		public int getProductId() {
			return productId;
		}
		public void setProductId(int productId) {
			this.productId = productId;
		}
		public String getProductName() {
			return productName;
		}
		public void setProductName(String productName) {
			this.productName = productName;
		}
		public String getProductInfo() {
			return productInfo;
		}
		public void setProductInfo(String productInfo) {
			this.productInfo = productInfo;
		}
		
		public String getProductImage() {
			return productImage;
		}
		public void setProductImage(String productImage) {
			this.productImage = productImage;
		}
}
