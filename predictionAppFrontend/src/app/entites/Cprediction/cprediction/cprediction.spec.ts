import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Cprediction } from './cprediction';

describe('Cprediction', () => {
  let component: Cprediction;
  let fixture: ComponentFixture<Cprediction>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Cprediction]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Cprediction);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
