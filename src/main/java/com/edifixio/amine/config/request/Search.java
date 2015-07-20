package com.edifixio.amine.config.request;

import java.util.ArrayList;

@SuppressWarnings("serial")
public class Search extends ArrayList<Request>{
		private String nameInBean;

		public Search(String nameInBean) {
			super();
			this.nameInBean = nameInBean;
		}

		public String getNameInBean() {
			return nameInBean;
		}

		public void setNameInBean(String nameInBean) {
			this.nameInBean = nameInBean;
		}
}
