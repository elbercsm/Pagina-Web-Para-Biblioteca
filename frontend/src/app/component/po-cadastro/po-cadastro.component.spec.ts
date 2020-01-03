import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PoCadastroComponent } from './po-cadastro.component';

describe('PoCadastroComponent', () => {
  let component: PoCadastroComponent;
  let fixture: ComponentFixture<PoCadastroComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PoCadastroComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PoCadastroComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
