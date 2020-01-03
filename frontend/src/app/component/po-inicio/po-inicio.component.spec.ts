import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PoInicioComponent } from './po-inicio.component';

describe('PoInicioComponent', () => {
  let component: PoInicioComponent;
  let fixture: ComponentFixture<PoInicioComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PoInicioComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PoInicioComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
