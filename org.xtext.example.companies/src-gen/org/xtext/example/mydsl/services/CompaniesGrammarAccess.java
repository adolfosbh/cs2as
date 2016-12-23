/*
 * generated by Xtext
 */
package org.xtext.example.mydsl.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import java.util.List;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;


@Singleton
public class CompaniesGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class CompanyElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.Companies.company");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cCompanyKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameSTRINGTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cDeparmentAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cDeparmentDepartmentParserRuleCall_3_0 = (RuleCall)cDeparmentAssignment_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//company:
		//	'company' name=STRING '{' deparment+=department* '}';
		@Override public ParserRule getRule() { return rule; }

		//'company' name=STRING '{' deparment+=department* '}'
		public Group getGroup() { return cGroup; }

		//'company'
		public Keyword getCompanyKeyword_0() { return cCompanyKeyword_0; }

		//name=STRING
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_1_0() { return cNameSTRINGTerminalRuleCall_1_0; }

		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }

		//deparment+=department*
		public Assignment getDeparmentAssignment_3() { return cDeparmentAssignment_3; }

		//department
		public RuleCall getDeparmentDepartmentParserRuleCall_3_0() { return cDeparmentDepartmentParserRuleCall_3_0; }

		//'}'
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}

	public class DepartmentElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.Companies.department");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cDepartmentKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameSTRINGTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cDepartment_managerAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cDepartment_managerDepartment_managerParserRuleCall_3_0 = (RuleCall)cDepartment_managerAssignment_3.eContents().get(0);
		private final Assignment cDepartment_employeesAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cDepartment_employeesDepartment_employeesParserRuleCall_4_0 = (RuleCall)cDepartment_employeesAssignment_4.eContents().get(0);
		private final Assignment cDeparmentAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cDeparmentDepartmentParserRuleCall_5_0 = (RuleCall)cDeparmentAssignment_5.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//department:
		//	'department' name=STRING '{'
		//	department_manager=department_manager
		//	department_employees=department_employees
		//	deparment+=department*
		//	'}';
		@Override public ParserRule getRule() { return rule; }

		//'department' name=STRING '{' department_manager=department_manager department_employees=department_employees
		//deparment+=department* '}'
		public Group getGroup() { return cGroup; }

		//'department'
		public Keyword getDepartmentKeyword_0() { return cDepartmentKeyword_0; }

		//name=STRING
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_1_0() { return cNameSTRINGTerminalRuleCall_1_0; }

		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }

		//department_manager=department_manager
		public Assignment getDepartment_managerAssignment_3() { return cDepartment_managerAssignment_3; }

		//department_manager
		public RuleCall getDepartment_managerDepartment_managerParserRuleCall_3_0() { return cDepartment_managerDepartment_managerParserRuleCall_3_0; }

		//department_employees=department_employees
		public Assignment getDepartment_employeesAssignment_4() { return cDepartment_employeesAssignment_4; }

		//department_employees
		public RuleCall getDepartment_employeesDepartment_employeesParserRuleCall_4_0() { return cDepartment_employeesDepartment_employeesParserRuleCall_4_0; }

		//deparment+=department*
		public Assignment getDeparmentAssignment_5() { return cDeparmentAssignment_5; }

		//department
		public RuleCall getDeparmentDepartmentParserRuleCall_5_0() { return cDeparmentDepartmentParserRuleCall_5_0; }

		//'}'
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
	}

	public class Department_managerElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.Companies.department_manager");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cManagerKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cEmployeeAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cEmployeeEmployeeParserRuleCall_1_0 = (RuleCall)cEmployeeAssignment_1.eContents().get(0);
		
		//department_manager:
		//	'manager' employee=employee;
		@Override public ParserRule getRule() { return rule; }

		//'manager' employee=employee
		public Group getGroup() { return cGroup; }

		//'manager'
		public Keyword getManagerKeyword_0() { return cManagerKeyword_0; }

		//employee=employee
		public Assignment getEmployeeAssignment_1() { return cEmployeeAssignment_1; }

		//employee
		public RuleCall getEmployeeEmployeeParserRuleCall_1_0() { return cEmployeeEmployeeParserRuleCall_1_0; }
	}

	public class Department_employeesElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.Companies.department_employees");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cDepartment_employeesAction_0 = (Action)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cEmployeeKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cEmployeeAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cEmployeeEmployeeParserRuleCall_1_1_0 = (RuleCall)cEmployeeAssignment_1_1.eContents().get(0);
		
		//department_employees:
		//	{department_employees} ('employee' employee+=employee)*;
		@Override public ParserRule getRule() { return rule; }

		//{department_employees} ('employee' employee+=employee)*
		public Group getGroup() { return cGroup; }

		//{department_employees}
		public Action getDepartment_employeesAction_0() { return cDepartment_employeesAction_0; }

		//('employee' employee+=employee)*
		public Group getGroup_1() { return cGroup_1; }

		//'employee'
		public Keyword getEmployeeKeyword_1_0() { return cEmployeeKeyword_1_0; }

		//employee+=employee
		public Assignment getEmployeeAssignment_1_1() { return cEmployeeAssignment_1_1; }

		//employee
		public RuleCall getEmployeeEmployeeParserRuleCall_1_1_0() { return cEmployeeEmployeeParserRuleCall_1_1_0; }
	}

	public class EmployeeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.Companies.employee");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameSTRINGTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cAddressKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cAddressAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cAddressSTRINGTerminalRuleCall_3_0 = (RuleCall)cAddressAssignment_3.eContents().get(0);
		private final Keyword cSalaryKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cSalaryAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cSalaryFLOATTerminalRuleCall_5_0 = (RuleCall)cSalaryAssignment_5.eContents().get(0);
		private final Group cGroup_6 = (Group)cGroup.eContents().get(6);
		private final Keyword cMentorKeyword_6_0 = (Keyword)cGroup_6.eContents().get(0);
		private final Assignment cMentorAssignment_6_1 = (Assignment)cGroup_6.eContents().get(1);
		private final RuleCall cMentorSTRINGTerminalRuleCall_6_1_0 = (RuleCall)cMentorAssignment_6_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//employee:
		//	name=STRING '{'
		//	'address' address=STRING
		//	'salary' salary=FLOAT ('mentor' mentor=STRING)?
		//	'}';
		@Override public ParserRule getRule() { return rule; }

		//name=STRING '{' 'address' address=STRING 'salary' salary=FLOAT ('mentor' mentor=STRING)? '}'
		public Group getGroup() { return cGroup; }

		//name=STRING
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }

		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_0_0() { return cNameSTRINGTerminalRuleCall_0_0; }

		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }

		//'address'
		public Keyword getAddressKeyword_2() { return cAddressKeyword_2; }

		//address=STRING
		public Assignment getAddressAssignment_3() { return cAddressAssignment_3; }

		//STRING
		public RuleCall getAddressSTRINGTerminalRuleCall_3_0() { return cAddressSTRINGTerminalRuleCall_3_0; }

		//'salary'
		public Keyword getSalaryKeyword_4() { return cSalaryKeyword_4; }

		//salary=FLOAT
		public Assignment getSalaryAssignment_5() { return cSalaryAssignment_5; }

		//FLOAT
		public RuleCall getSalaryFLOATTerminalRuleCall_5_0() { return cSalaryFLOATTerminalRuleCall_5_0; }

		//('mentor' mentor=STRING)?
		public Group getGroup_6() { return cGroup_6; }

		//'mentor'
		public Keyword getMentorKeyword_6_0() { return cMentorKeyword_6_0; }

		//mentor=STRING
		public Assignment getMentorAssignment_6_1() { return cMentorAssignment_6_1; }

		//STRING
		public RuleCall getMentorSTRINGTerminalRuleCall_6_1_0() { return cMentorSTRINGTerminalRuleCall_6_1_0; }

		//'}'
		public Keyword getRightCurlyBracketKeyword_7() { return cRightCurlyBracketKeyword_7; }
	}
	
	
	private final CompanyElements pCompany;
	private final DepartmentElements pDepartment;
	private final Department_managerElements pDepartment_manager;
	private final Department_employeesElements pDepartment_employees;
	private final EmployeeElements pEmployee;
	private final TerminalRule tSTRING;
	private final TerminalRule tFLOAT;
	private final TerminalRule tWS;
	
	private final Grammar grammar;

	@Inject
	public CompaniesGrammarAccess(GrammarProvider grammarProvider) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.pCompany = new CompanyElements();
		this.pDepartment = new DepartmentElements();
		this.pDepartment_manager = new Department_managerElements();
		this.pDepartment_employees = new Department_employeesElements();
		this.pEmployee = new EmployeeElements();
		this.tSTRING = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.Companies.STRING");
		this.tFLOAT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.Companies.FLOAT");
		this.tWS = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.Companies.WS");
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.example.mydsl.Companies".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	

	
	//company:
	//	'company' name=STRING '{' deparment+=department* '}';
	public CompanyElements getCompanyAccess() {
		return pCompany;
	}
	
	public ParserRule getCompanyRule() {
		return getCompanyAccess().getRule();
	}

	//department:
	//	'department' name=STRING '{'
	//	department_manager=department_manager
	//	department_employees=department_employees
	//	deparment+=department*
	//	'}';
	public DepartmentElements getDepartmentAccess() {
		return pDepartment;
	}
	
	public ParserRule getDepartmentRule() {
		return getDepartmentAccess().getRule();
	}

	//department_manager:
	//	'manager' employee=employee;
	public Department_managerElements getDepartment_managerAccess() {
		return pDepartment_manager;
	}
	
	public ParserRule getDepartment_managerRule() {
		return getDepartment_managerAccess().getRule();
	}

	//department_employees:
	//	{department_employees} ('employee' employee+=employee)*;
	public Department_employeesElements getDepartment_employeesAccess() {
		return pDepartment_employees;
	}
	
	public ParserRule getDepartment_employeesRule() {
		return getDepartment_employeesAccess().getRule();
	}

	//employee:
	//	name=STRING '{'
	//	'address' address=STRING
	//	'salary' salary=FLOAT ('mentor' mentor=STRING)?
	//	'}';
	public EmployeeElements getEmployeeAccess() {
		return pEmployee;
	}
	
	public ParserRule getEmployeeRule() {
		return getEmployeeAccess().getRule();
	}

	//terminal STRING:
	//	'"' !'"'* '"';
	public TerminalRule getSTRINGRule() {
		return tSTRING;
	} 

	//terminal FLOAT returns ecore::EDouble:
	//	'0'..'9'+ ('.' '0'..'9'+)?;
	public TerminalRule getFLOATRule() {
		return tFLOAT;
	} 

	//terminal WS:
	//	' ' | '\r'? '\n' | '\t'+;
	public TerminalRule getWSRule() {
		return tWS;
	} 
}
