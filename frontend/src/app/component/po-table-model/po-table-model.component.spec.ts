import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PoTableModelComponent } from './po-table-model.component';

describe('PoTableModelComponent', () => {
  let component: PoTableModelComponent;
  let fixture: ComponentFixture<PoTableModelComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PoTableModelComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PoTableModelComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
