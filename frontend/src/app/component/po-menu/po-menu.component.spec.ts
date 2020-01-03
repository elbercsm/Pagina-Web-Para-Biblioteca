import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PoMenuComponent } from './po-menu.component';

describe('PoMenuComponent', () => {
  let component: PoMenuComponent;
  let fixture: ComponentFixture<PoMenuComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PoMenuComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PoMenuComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
