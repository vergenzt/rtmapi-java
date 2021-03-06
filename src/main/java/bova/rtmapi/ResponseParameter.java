package bova.rtmapi;
//Copyright 2012 Giovanni Pini
//Licensed under the Apache License, Version 2.0 (the "License");
//you may not use this file except in compliance with the License.
//You may obtain a copy of the License at
//http://www.apache.org/licenses/LICENSE-2.0
//Unless required by applicable law or agreed to in writing, software
//distributed under the License is distributed on an "AS IS" BASIS,
//WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
//See the License for the specific language governing permissions and
//limitations under the License.



enum ResponseParameter {
	ADDED("added"),
	ADDRESS("address"),
	ARCHIVED("archived"),
	ARGUMENT("argument"),
	ARGUMENTS("arguments"),
	AUTH("auth"), 
	CODE("code"),
	COMPLETED("completed"),
	CONTACT("contact"),
	CONTACTS("contacts"),
	CREATED("created"),
	CURRENT("current"),
	CURRENT_OFFSET("current_offset"),
	DATE_FORMAT("dateformat"),
	DEFAULT_LIST("defaultlist"),
	DELETED("deleted"),
	DESCRIPTION("description"),
	DST("dst"),
	DUE("due"),
	ERR("err"),
	ERROR("error"),
	ERRORS("errors"),
	EVERY("every"),
	ESTIMATE("estimate"),
	FROB("frob"),
	FULLNAME("fullname"),
	GROUP("group"),
	GROUPS("groups"),
	HAS_DUE_TIME("has_due_time"),
	ID("id"),
	LANGUAGE("language"),
	LATITUDE("latitude"),
	LIST("list"),
	LISTS("lists"),
	LONGITUDE("longitude"),
	LOCATION_ID("location_id"),
	LOCATION("location"),
	LOCATIONS("locations"),
	LOCKED("locked"),
	MESSAGE("message"),
	METHOD("method"),
	METHODS("methods"),
	MODIFIED("modified"),
	MSG("msg"),
	NAME("name"),
	NEEDSLOGIN("needslogin"),
	NEEDSSIGNING("needssigning"),
	NOTE("note"),
	NOTES("notes"),
	OFFSET("offset"),
	OPTIONAL("optional"),
	PARTICIPANTS("participants"),
	POSTPONED("postponed"),
	PERMS("perms"),
	PRIORITY("priority"),
	REQUIREDPERMS("requiredperms"),
	RESPONSE("response"),
	RRULE("rrule"),
	RSP("rsp"),
	POSITION("position"),
	SETTINGS("settings"),
	SORT_ORDER("sort_order"),
	SOURCE("source"),
	SMART("smart"),
	STATUS("stat"),
	T("$t"),
	TAG("tag"),
	TAGS("tags"),
	TASK("task"),
	TASKS("tasks"),
	TASKSERIES("taskseries"),
	TEXT("text"),
	TIME("time"),
	TIME_FORMAT("timeformat"),
	TIMELINE("timeline"),
	TIMEZONE("timezone"),
	TIMEZONES("timezones"),
	TITLE("title"),
	TOKEN("token"),
	TRANSACTION("transaction"),
	UNDOABLE("undoable"),
	URL("url"),
	USER("user"),
	USERNAME("username"),
	VIEWABLE("viewable"),
	ZOOM("zoom");	
	private String tag;
	private ResponseParameter(String tag) {this.tag = tag;}
	public String toString() {return this.tag;}
}
