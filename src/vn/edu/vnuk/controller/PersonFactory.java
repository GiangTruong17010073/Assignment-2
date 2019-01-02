package vn.edu.vnuk.controller;

import vn.edu.vnuk.define.Define;
import vn.edu.vnuk.model.CasualWorkers;
import vn.edu.vnuk.model.Lectures;
import vn.edu.vnuk.model.Person;
import vn.edu.vnuk.model.Staff;

public class PersonFactory {
	public static Person getPerson(int type) {
		Define.latestId++;
		switch (type) {
		case Define.TYPE_OF_LECTURE: return new Lectures.LecturesBuilder(Define.latestId, type).build();
		case Define.TYPE_OF_STAFF: return new Staff.StaffBuilder(Define.latestId, type).build();
		case Define.TYPE_OF_CASUALWORKER: return new CasualWorkers.CasualWorkersBuilder(Define.latestId, type).build();
		}
		return null;
		
	}
}
